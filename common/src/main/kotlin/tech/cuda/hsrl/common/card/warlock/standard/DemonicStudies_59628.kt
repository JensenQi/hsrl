package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DemonicStudies_59628 : Card() {
    override val id = 59628
    override val name = "恶魔研习"
    override val description = "<b>发现</b>一张恶魔牌。你的下一张恶魔牌法力值消耗减少（1）点。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“听说你想召唤一个恶魔？我这里有啊！”"
    override val artist = "Kagi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/28c9aa1699da51b54eed7222ec0bb158d0e8f98c03bf7634d92365f3e1f5a547.png"
}
