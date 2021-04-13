package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KabalLackey_40299 : Card() {
    override val id = 40299
    override val name = "暗金教侍从"
    override val description = "<b>战吼：</b> 在本回合中，你使用的下一个<b>奥秘</b>的法力值消耗为（0）点。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Msog
    override val background = "他配制的药水粘稠度很高。"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6035efec9e26c29d705c99806b37c3509a75043c698f7743d9257ad239086d5d.png"
}
