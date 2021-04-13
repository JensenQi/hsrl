package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrandTotemEysor_61663 : Card() {
    override val id = 61663
    override val name = "巨型图腾埃索尔"
    override val description = "在你的回合结束时，使你手牌，牌库以及战场中的所有其他图腾获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Totem
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "敢于阅读这则卡牌趣文的读者啊，听说，它能直接看穿你的灵魂……"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eb03a9fc4b56ff7455b9f6b5faab01840d3d975c2bbf4478756bc78c9a01ea32.png"
}
