package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArchVillainRafaam_52119 : Card() {
    override val id = 52119
    override val name = "至尊盗王拉法姆"
    override val description = "<b>嘲讽</b> <b>战吼：</b>将你的手牌和牌库里的卡牌替换为<b>传说</b>随从。"
    override var cost: Int? = 7
    override var health: Int? = 8
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.RiseOfShadows
    override val background = "所有随从在下班出门之前必须搜身。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/387e3c4fd8a7bb59947047051da63ee39ac39727dd7e299ca1e034e1d4c835da.png"
}
