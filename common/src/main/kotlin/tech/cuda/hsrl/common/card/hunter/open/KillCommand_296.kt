package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KillCommand_296 : Card() {
    override val id = 296
    override val name = "杀戮命令"
    override val description = "造成 3点伤害。如果你控制一个野兽，则改为造成 5点伤害。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Legacy1635
    override val background = "“咬死他！”，他下达了命令。"
    override val artist = "Gabe from Penny Arcade"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/573d84452f7ac610520ed434850b7c0a2e401f41fcc9cd3d6f7bc49ce33275fb.png"
}
