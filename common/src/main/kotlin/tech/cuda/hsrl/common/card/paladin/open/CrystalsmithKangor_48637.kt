package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CrystalsmithKangor_48637 : Card() {
    override val id = 48637
    override val name = "水晶工匠坎格尔"
    override val description = "<b>圣盾，吸血</b> 你的治疗效果翻倍。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.BoomsdayProject
    override val background = "他想做坦克，但砰砰博士老叫他做辅助。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/849e39beab7ce6f9c234a7aaddcc4685543f685e303a325697816c45fe36ef8c.png"
}
