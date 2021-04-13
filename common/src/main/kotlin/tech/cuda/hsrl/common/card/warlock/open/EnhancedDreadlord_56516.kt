package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EnhancedDreadlord_56516 : Card() {
    override val id = 56516
    override val name = "改进型恐惧魔王"
    override val description = "<b>嘲讽，亡语：</b>召唤一个5/5并具有<b>吸血</b>的恐惧魔王。"
    override var cost: Int? = 8
    override var health: Int? = 7
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.AshesOfOutland
    override val background = "这张照片拍摄的其实是街对面的球形门把手上反射出的形象。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/295a7043d1d37a9a73ae64e8ec8849f52c4734c5febed3c1de1081ff47911931.png"
}
