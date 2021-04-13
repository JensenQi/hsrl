package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DevoutPupil_59584 : Card() {
    override val id = 59584
    override val name = "虔诚的学徒"
    override val description = "<b>圣盾，嘲讽</b> 在本局对战中，你每对友方角色施放一个法术，该牌的法力值消耗便减少 （1）点。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "圣光自带的照明效果使得阅读体验愈加轻松。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/800a99b226f576dab943902645e13f00e230782180ca622fc10464f215ca7484.png"
}
