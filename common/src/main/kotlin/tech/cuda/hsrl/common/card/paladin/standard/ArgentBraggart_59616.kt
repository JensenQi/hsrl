package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArgentBraggart_59616 : Card() {
    override val id = 59616
    override val name = "银色自大狂"
    override val description = "<b>战吼：</b>获得攻击力和生命值，使其与战场上最高的数值相同。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "不知道他有什么可吹的，并列第一而已。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bc9459e2f67402ed0c3aa387b0c9907cc729112aadac67fed9ed5e390189cefc.png"
}
