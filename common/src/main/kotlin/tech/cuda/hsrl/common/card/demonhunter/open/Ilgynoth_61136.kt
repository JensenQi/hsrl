package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Ilgynoth_61136 : Card() {
    override val id = 61136
    override val name = "伊格诺斯"
    override val description = "<b>吸血</b> 你的<b>吸血</b>会对敌方英雄造成伤害，而非治疗你。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "听上去就像是绕了两步的伤害。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0d11262dd5c2f819eeae435e5be3640f5b687d0c1ce939d356aa960d1b56c727.png"
}
