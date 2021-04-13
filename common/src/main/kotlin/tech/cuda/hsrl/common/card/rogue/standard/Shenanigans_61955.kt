package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shenanigans_61955 : Card() {
    override val id = 61955
    override val name = "蕉猾诡计"
    override val description = "<b>奥秘：</b>当你的对手在一个回合中抽到第二张牌时，将其变形成为一张香蕉。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "猢狲的赛场哲学：不论私蕉，公事公绊。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/551dfb1947ff76f9ae10ce211fab1936c462e293d3a717f52745d85b751f204f.png"
}
