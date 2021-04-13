package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UmbralOwl_61461 : Card() {
    override val id = 61461
    override val name = "幽影猫头鹰"
    override val description = "<b>突袭</b> 在本局对战中，你每施放一个法术就会使法力值消耗减少（1）点。"
    override var cost: Int? = 7
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "猫头鹰生性警觉，睡觉时都睁着一只眼。"
    override val artist = "Patrik Bjorkstrom"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9e857986b0d90ef7c49d06d51efe4d397ba3ac0eea9f89455d7f8d01653dbeaf.png"
}
