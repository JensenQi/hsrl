package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnstableEvolution_46303 : Card() {
    override val id = 46303
    override val name = "不稳定的异变"
    override val description = "将一个友方随从随机变形成为一个法力值消耗增加（1）点的随从。在本回合可以重复使用。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "它们长得真快。"
    override val artist = "Tooth"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a20231eb972b84a441c30abf598d34afcb4c306c5e8e8cbe4ee18b7b765ae7c4.png"
}
