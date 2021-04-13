package tech.cuda.hsrl.common.card.rogue.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MasterOfDisguise_70080 : Card() {
    override val id = 70080
    override val name = "伪装大师"
    override val description = "<b>战吼：</b>使一个友方随从获得<b>潜行</b>。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ClassicCards
    override val background = "实际上“她”是一个男性牛头人。你以为随便哪个人都配得上“伪装大师”的名号吗？"
    override val artist = "Ron Spencer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b784277144fbf0e7c67869bad1bed2374806a33d52d400e17fc70305157661ee.png"
}
