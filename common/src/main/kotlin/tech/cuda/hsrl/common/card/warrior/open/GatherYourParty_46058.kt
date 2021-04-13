package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GatherYourParty_46058 : Card() {
    override val id = 46058
    override val name = "寻求组队"
    override val description = "<b>招募</b>一个随从。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "多么激动人心的冒险！肯定会有危急情况发生！战利品未知！可能会死亡！有人和我一起来吗？"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d3bd3aaf9fb4b7154c80d5bb10c2b0c399171b2bffb1f8e34cb07855edb0d78c.png"
}
