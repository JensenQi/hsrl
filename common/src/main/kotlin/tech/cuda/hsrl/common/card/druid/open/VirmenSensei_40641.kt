package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VirmenSensei_40641 : Card() {
    override val id = 40641
    override val name = "兔妖教头"
    override val description = "<b>战吼：</b>使一个友方野兽获得+2/+2。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Msog
    override val background = "上课禁止携带胡萝卜。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e453bec7dc21a8b908d7d71aa378d8cf741533685a85f5bffb77b9eb78532e77.png"
}
