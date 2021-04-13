package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MasterOfDisguise_887 : Card() {
    override val id = 887
    override val name = "伪装大师"
    override val description = "<b>战吼：</b>直到你的下个回合，使一个友方随从获得<b>潜行</b>。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Legacy3
    override val background = "实际上“她”是一个男性牛头人。你以为随便哪个人都配得上“伪装大师”的名号吗？"
    override val artist = "Ron Spencer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e3b70bc502a8d4d64a8e06dee1a1f942689a2df6868cb6aa17b451ececdc65dc.png"
}
