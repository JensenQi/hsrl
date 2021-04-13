package tech.cuda.hsrl.common.card.warrior.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Charge_68371 : Card() {
    override val id = 68371
    override val name = "冲锋"
    override val description = "使一个友方随从获得+2攻击力和<b>冲锋</b>。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ClassicCards
    override val background = "“伙计们！伙计们！你们稳着点儿！”——某些不属于战士的随从。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4b8c114ccf7fdafb20b43dae85c83661cd4aafd7c9804c1234549677cdfbb589.png"
}
