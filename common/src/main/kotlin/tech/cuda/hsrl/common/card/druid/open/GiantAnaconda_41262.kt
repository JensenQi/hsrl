package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GiantAnaconda_41262 : Card() {
    override val id = 41262
    override val name = "巨型蟒蛇"
    override val description = "<b>亡语：</b>从你手牌中召唤一个攻击力大于或等于5的随从。"
    override var cost: Int? = 7
    override var health: Int? = 3
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Ungoro
    override val background = "这条蛇在生前吃了个大家伙。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/92b1f3068013d0fe1c611ccfd889f44a11b62bf51aa566c8c6c19cc720b8521a.png"
}
