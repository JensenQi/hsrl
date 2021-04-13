package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RaiseDead_59223 : Card() {
    override val id = 59223
    override val name = "亡者复生"
    override val description = "对你的英雄造成 3点伤害。将两个在本局对战中死亡的友方随从移回你的手牌。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "从专业角度讲，这个算是迟到的治疗法术。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fde7ca0426a52d3dbd6af93e4d7f3021be0b98cb33075e5dc6701cdf2484c4e1.png"
}
