package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GallopingSavior_63323 : Card() {
    override val id = 63323
    override val name = "迅疾救兵"
    override val description = "<b>奥秘：</b>当你的对手在一回合中使用三张牌后，召唤一匹3/4并具有<b>嘲讽</b>的战马。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“当第三张牌的光芒初现，我便会及时赶来。”"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/346abb892e0b648dff77af81e003a82540627b3e04a0f0b2cf7a49ad28350658.png"
}
