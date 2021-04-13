package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ScrapGolem_57165 : Card() {
    override val id = 57165
    override val name = "废铁魔像"
    override val description = "<b>嘲讽，亡语：</b>获得等同于该随从攻击力的护甲值。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.AshesOfOutland
    override val background = "这是我最后的护甲，收下吧！"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e0c07fe66677670e2bc1ebd88d991604afb0f32e3dce8600b41f0fce6151f95b.png"
}
