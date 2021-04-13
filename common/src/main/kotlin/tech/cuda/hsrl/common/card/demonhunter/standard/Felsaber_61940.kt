package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Felsaber_61940 : Card() {
    override val id = 61940
    override val name = "邪刃豹"
    override val description = "在本回合中，除非你的英雄进行过攻击，否则无法进行攻击。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "有些选手会把引擎轰出阵阵低吼，但这家伙都是亲自吼。"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1da67d23dfac966faf646bbeed0e70b69b417443db560b9a2cccea1357b4f8c7.png"
}
