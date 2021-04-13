package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Guidance_61962 : Card() {
    override val id = 61962
    override val name = "灵魂指引"
    override val description = "检视两张法术牌。将其中一张置入你的手牌；或者<b>过载：</b>（1），获得这两张牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "使用原野疾驰技能会被取消参赛资格。"
    override val artist = "Ware Lee"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b8cfe1318bb9bc9b913e5f4a04cc0f0473ab747d35ce915e95af1c10f0cc6c6d.png"
}
