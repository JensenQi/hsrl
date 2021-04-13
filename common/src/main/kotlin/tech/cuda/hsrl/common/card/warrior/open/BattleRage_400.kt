package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BattleRage_400 : Card() {
    override val id = 400
    override val name = "战斗怒火"
    override val description = "每有一个受伤的友方角色，便抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Legacy3
    override val background = "“你不会喜欢我生气的样子。”"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/adede6e4cf79d98250df224912f2e543c440d6bae637da2cb78a74f38a5509e2.png"
}
