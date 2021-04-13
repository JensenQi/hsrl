package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MalevolentStrike_61169 : Card() {
    override val id = 61169
    override val name = "致伤打击"
    override val description = "消灭一个随从。你的牌库中每有一张套牌之外的牌，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“我不管那些家伙是怎么混进牌库的，我现在就抓到了你们两个。”"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/77511e44695e993cf4e037104dd8444064e2ff55b5509084b9328e054f0f8934.png"
}
