package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OhMyYogg_61187 : Card() {
    override val id = 61187
    override val name = "古神在上"
    override val description = "<b>奥秘：</b>在你的对手施放一个法术时，使其改为随机施放一个法力值消耗相同的法术。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "口中奇珍，并非玩物；听从支配，倾心拜服。"
    override val artist = "Wayne Wu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5c96eb9ea1bb96715923aba24942de9112f26e3ddd518bf656363410f8f8dbbe.png"
}
