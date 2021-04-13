package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MojomasterZihi_51136 : Card() {
    override val id = 51136
    override val name = "魔精大师兹伊希"
    override val description = "<b>战吼：</b> 将双方玩家的法力水晶重置为五个。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "兹伊希大师距离宗师级草药学还差两点。"
    override val artist = "J. Axer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/59aad300241e31dd9e9087f97e990758dc117631ffbbc6711e4a3b89d0691b9c.png"
}
