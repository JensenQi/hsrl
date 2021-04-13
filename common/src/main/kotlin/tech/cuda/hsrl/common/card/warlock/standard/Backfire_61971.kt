package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Backfire_61971 : Card() {
    override val id = 61971
    override val name = "赛车回火"
    override val description = "抽三张牌。对你的英雄造成 3点伤害。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“我再也不让小鬼往我的车里吐燃料了。”"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/00a8b6c01640182a9cafb0cc6e663d8c1fa92d24023746657dbd95a0ece5b420.png"
}
