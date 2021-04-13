package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DevolvingMissiles_58976 : Card() {
    override val id = 58976
    override val name = "衰变飞弹"
    override val description = "随机向敌方随从发射三枚飞弹，使其变形成为法力值消耗减少（1）点的随从。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "校内法术对决赛总是以满地的小精灵收场。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/426d1e4a1d0cceda5a34a0c77c8f11d292c8dd25fa30d628e531646935368e7b.png"
}
