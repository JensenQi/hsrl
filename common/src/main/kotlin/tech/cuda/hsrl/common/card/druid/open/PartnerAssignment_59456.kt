package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PartnerAssignment_59456 : Card() {
    override val id = 59456
    override val name = "分配组员"
    override val description = "随机将法力值消耗为（2）和（3）的野兽牌各一张置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "每个小组都要有几条大腿。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/19a74183c4dfe14d47fa9d8f2d720f5a653de87463b69e3feb1fae1e9d767fd5.png"
}
