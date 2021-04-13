package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Spellbender_366 : Card() {
    override val id = 366
    override val name = "扰咒术"
    override val description = "<b>奥秘：</b>当一个敌方法术以一个随从为目标时，召唤一个1/3的随从并使其成为新的目标。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Legacy3
    override val background = "虽然干扰敌人的闪电箭非常有意思，但是扰咒师更喜欢干扰对手使用野性印记。那种感觉会更卑鄙。至于血精灵...呃，他们只是稍微有点卑鄙而已。"
    override val artist = "Gonzalo Ordonez"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5a5e3b5bd2daed67c26797e2cba7337ed4e1a22e18c7ce1b8eb8b76edf6b7357.png"
}
