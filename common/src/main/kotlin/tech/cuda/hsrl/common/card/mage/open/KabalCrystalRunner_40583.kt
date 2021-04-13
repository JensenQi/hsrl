package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KabalCrystalRunner_40583 : Card() {
    override val id = 40583
    override val name = "暗金教水晶侍女"
    override val description = "在本局对战中，你每使用一张奥秘牌 就会使法力值消耗减少（2）点。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Msog
    override val background = "嗨，想要点私货吗？可千万别告诉我的老板！"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c660627f076387700afb3c88099c1ef274e62df7411e78bc503f16f33c58bc89.png"
}
