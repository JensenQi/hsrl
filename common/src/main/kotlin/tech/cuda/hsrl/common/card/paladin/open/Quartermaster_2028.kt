package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Quartermaster_2028 : Card() {
    override val id = 2028
    override val name = "军需官"
    override val description = "<b>战吼：</b>使你的白银之手新兵获得+2/+2。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Gvg
    override val background = "自从乌瑟尔把他招募到麾下之后，他觉得新兵大喊“报告”的声音不再那么烦人了。"
    override val artist = "Phroilan Gardner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f17d85edddc9d611c5d90550f9bd69b9ab6a90156d300a15da050b0589e3f173.png"
}
