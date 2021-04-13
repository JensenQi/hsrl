package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlackwingCorruptor_2409 : Card() {
    override val id = 2409
    override val name = "黑翼腐蚀者"
    override val description = "<b>战吼：</b>如果你的手牌中有龙牌，则造成3点伤害。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Brm
    override val background = "当他把几本漫画书和几张摇滚碟片带回黑石山的时候，他就获得了“腐蚀者”的称号。"
    override val artist = "Greg Staples"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/99614ae4b399139feffb5611ec8b636248939008b6b96194ce219ef8cc453a02.png"
}
