package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpectralPillager_45975 : Card() {
    override val id = 45975
    override val name = "鬼灵匪贼"
    override val description = "<b>连击：</b>造成伤害，数值等同于在本回合中你使用的其他牌的 数量。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Kotf
    override val background = "你也可以把她和赃物一起带走。"
    override val artist = "Sam Nielson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d2d1eb8dc47129306dd0625bc782c2fa853ca524455b223de72768e16b645e3c.png"
}
