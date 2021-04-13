package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CurseOfWeakness_47555 : Card() {
    override val id = 47555
    override val name = "虚弱诅咒"
    override val description = "<b>回响</b> 直到你的下个回合，使所有敌方随从获得-2攻击力。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.TheWitchwood
    override val background = "它还有另外一个更广为人知的名字——平衡性补丁。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3b36196176d80344fc15223fac625881ef2d3b32070b8b85fe67d9a985e24ab4.png"
}
