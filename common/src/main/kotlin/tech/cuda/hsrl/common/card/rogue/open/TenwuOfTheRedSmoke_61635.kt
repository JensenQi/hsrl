package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TenwuOfTheRedSmoke_61635 : Card() {
    override val id = 61635
    override val name = "“赤烟”腾武"
    override val description = "<b>战吼：</b>将一个友方随从移回你的手牌，在本回合中，其法力值消耗为（1）点。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "赤红如火，难知如烟。"
    override val artist = "Juyoung Oh"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1fd513539f188babf60918db1ce74d0886f4e84031a6024cf86dc4bbe6efd7e6.png"
}
