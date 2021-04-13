package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CompetitiveSpirit_2648 : Card() {
    override val id = 2648
    override val name = "争强好胜"
    override val description = "<b>奥秘：</b>在你的回合开始时，使你的所有随从获得+1/+1。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Tgt
    override val background = "争强好胜既可能挖掘一个人的内在潜力，又可能害死竞争者本人。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8449a3464d3dcc5ba45b4d4e4d0c1147118340a9453adaabf330b0280b427bc1.png"
}
