package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodHerald_59720 : Card() {
    override val id = 59720
    override val name = "嗜血传令官"
    override val description = "如果这张牌在你的手牌中，每当一个友方随从死亡，便获得+1/+1。"
    override var cost: Int? = 5
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“红血饮料，给你一双翅膀。”"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1d949c8b8517b233963850a961c7e7b73b3fbae0abfb0729df58409a589d8755.png"
}
