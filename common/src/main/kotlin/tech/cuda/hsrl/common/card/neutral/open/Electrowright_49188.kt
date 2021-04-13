package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Electrowright_49188 : Card() {
    override val id = 49188
    override val name = "电能工匠"
    override val description = "<b>战吼：</b> 如果你的手牌中有法力值消耗大于或等于（5）点的法术牌，便获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "精修各种电气故障。"
    override val artist = "Cicily He"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/efec14656f86c36ff7bf740b59a473c404695969bb1d4cfe0d5bb2c7db1315b5.png"
}
