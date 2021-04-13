package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VileCall_63165 : Card() {
    override val id = 63165
    override val name = "邪恶召唤"
    override val description = "召唤两个2/2并具有<b>吸血</b>的 恶魔。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“召唤你们前来就是要通知你们，你们的保险快过期了。”"
    override val artist = "Konstantin Porubov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5d7261a8ffe456deac956217cee81cf0930bc01a51ed2c793dc0874650a41b49.png"
}
