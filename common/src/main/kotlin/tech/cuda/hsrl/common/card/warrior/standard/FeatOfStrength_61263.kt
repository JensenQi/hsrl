package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FeatOfStrength_61263 : Card() {
    override val id = 61263
    override val name = "实力担当"
    override val description = "随机使你手牌中的一张<b>嘲讽</b>随从牌获得+5/+5。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "不知道我顶不顶得住。"
    override val artist = "K. Lashley & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e366729a43e1197387892f4bb8e5c9973837f0af70269d0990f256ffd92dfdb9.png"
}
