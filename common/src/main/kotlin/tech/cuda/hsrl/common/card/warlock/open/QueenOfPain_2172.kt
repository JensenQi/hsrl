package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class QueenOfPain_2172 : Card() {
    override val id = 2172
    override val name = "痛苦女王"
    override val description = "<b>吸血</b>"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Gvg
    override val background = "她总是觉得她的姐姐欢乐女王有点神经质：世间哪有这么多可以令她发笑的事情？"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4f22157161715780f81628afc89f50c533c204e9291c7fc2598a9966a4b3268d.png"
}
