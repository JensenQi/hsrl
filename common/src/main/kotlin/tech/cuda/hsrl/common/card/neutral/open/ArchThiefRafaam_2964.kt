package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArchThiefRafaam_2964 : Card() {
    override val id = 2964
    override val name = "虚灵大盗拉法姆"
    override val description = "<b>战吼：发现</b>一张强大的神器牌。"
    override var cost: Int? = 9
    override var health: Int? = 8
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Loe
    override val background = "他在搜集神器方面很有一手，只不过都是从别人的博物馆里抢来的。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/33572b988bfaaf4e5a475018e352fd705ab7d056006e278d13907b1264d7b604.png"
}
