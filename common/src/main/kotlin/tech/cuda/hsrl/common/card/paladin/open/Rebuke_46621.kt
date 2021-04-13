package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Rebuke_46621 : Card() {
    override val id = 46621
    override val name = "责难"
    override val description = "下个回合敌方法术的法力值消耗增加（5）点。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.TheWitchwood
    override val background = "爱之深，责之切 恨之深，难施法。"
    override val artist = "Tyler West Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/88bb87cf49033bb9d89691cfd44270ee2f06d5337710b39f611844661a27ad78.png"
}
