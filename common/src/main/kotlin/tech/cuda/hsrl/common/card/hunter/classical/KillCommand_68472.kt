package tech.cuda.hsrl.common.card.hunter.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KillCommand_68472 : Card() {
    override val id = 68472
    override val name = "杀戮命令"
    override val description = "造成 3点伤害。如果你控制一个野兽，则改为造成 5点伤害。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ClassicCards
    override val background = "“咬死他！”，他下达了命令。"
    override val artist = "Gabe from Penny Arcade"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/14454c89f77242cb9e66e7efc4e758bfe6b522e07851585c289a531dea36f406.png"
}
