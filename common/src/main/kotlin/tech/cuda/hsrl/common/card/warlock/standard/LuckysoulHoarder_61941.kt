package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LuckysoulHoarder_61941 : Card() {
    override val id = 61941
    override val name = "幸运之魂囤积者"
    override val description = "<b>战吼：</b>将两张灵魂残片洗入你的牌库。<b>腐蚀：</b>抽一张牌。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "始终随身携带他的可重复利用购物袋，旅行包，木桶，衣箱，托盘，还有那个软软的垫子。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2c81e4df9d285b6b195d0a3996c99ae7dd8bfbce7509b05c7e05ffdafc674bf6.png"
}
