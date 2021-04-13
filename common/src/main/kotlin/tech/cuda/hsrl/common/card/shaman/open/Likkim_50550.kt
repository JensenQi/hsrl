package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Likkim_50550 : Card() {
    override val id = 50550
    override val name = "舔舔魔杖"
    override val description = "当你有<b>过载</b>的法力水晶时，获得+2攻击力。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.RastakhansRumble
    override val background = "什么？只要过载就能提高2点攻击力？那还不舔爆？！"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0c4b435a346b4ed1e477ad8b03ce10d2526aca7c4a35d102db647a6b64fc2ef5.png"
}
