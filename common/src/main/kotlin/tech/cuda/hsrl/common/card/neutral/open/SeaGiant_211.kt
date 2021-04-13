package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SeaGiant_211 : Card() {
    override val id = 211
    override val name = "海巨人"
    override val description = "战场上每有一个其他随从，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 10
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "嗨，巨人！"
    override val artist = "Svetlin Velinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0ae8d11071785ea7750db3f09a3685dac087ed382a90a4b8ff1e35be8a27e07a.png"
}
