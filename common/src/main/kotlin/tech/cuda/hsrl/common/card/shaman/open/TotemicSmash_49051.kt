package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TotemicSmash_49051 : Card() {
    override val id = 49051
    override val name = "图腾重击"
    override val description = "造成 2点伤害。 <b>超杀</b>：召唤一个 基础图腾。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.RastakhansRumble
    override val background = "巨魔是首个掌握了轨道图腾回收技术的种族。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cffc141b5e14de92f2ac192ad05eb27d21cc203317758433f19483cd1916a665.png"
}
