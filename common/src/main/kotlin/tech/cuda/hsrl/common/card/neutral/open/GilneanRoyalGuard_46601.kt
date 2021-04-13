package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GilneanRoyalGuard_46601 : Card() {
    override val id = 46601
    override val name = "吉尔尼斯皇家卫兵"
    override val description = "<b>圣盾，突袭</b> 如果这张牌在你的手牌中，每个回合使其攻击力和生命值互换。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "坦白讲，她们对利亚姆王子的死负有不可推卸的责任。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ac1fe7639100458108128f630850d4fa16742135384417bce1bea6435174d398.png"
}
