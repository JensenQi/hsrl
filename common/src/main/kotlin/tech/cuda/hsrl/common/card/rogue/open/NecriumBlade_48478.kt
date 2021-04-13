package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NecriumBlade_48478 : Card() {
    override val id = 48478
    override val name = "死金匕首"
    override val description = "<b>亡语：</b> 随机触发一个友方随从的<b>亡语</b>。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.BoomsdayProject
    override val background = "匕首的柄部装有死金药剂。"
    override val artist = "Vlad Botos"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cdd7660c171f226360c99cb7bcbb97e9e84466b3f0714b5a7dc24f8ceca547d7.png"
}
