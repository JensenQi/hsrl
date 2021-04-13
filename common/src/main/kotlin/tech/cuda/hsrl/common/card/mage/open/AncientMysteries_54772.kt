package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AncientMysteries_54772 : Card() {
    override val id = 54772
    override val name = "远古谜团"
    override val description = "从你的牌库中抽一张<b>奥秘</b>牌。其法力值消耗为（0）点。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "我不是说这是外星人干的，这<b>根本</b>就是外星人干的！"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/37af6ec07216a673a1969235dde2fb2326938e99463d20d8388044af241242c3.png"
}
