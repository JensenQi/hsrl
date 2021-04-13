package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BeastmasterLeoroxx_56758 : Card() {
    override val id = 56758
    override val name = "兽王莱欧洛克斯"
    override val description = "<b>战吼：</b>从你的手牌中召唤三只野兽。"
    override var cost: Int? = 8
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.AshesOfOutland
    override val background = "部落勇士雷克萨的父亲，也就是其他职业的……"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/81df45e50d82347770be1dad221ea58dba3e71054ab15b4e9ada74fdf311d017.png"
}
